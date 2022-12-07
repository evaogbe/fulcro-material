(ns ogbe.fulcro.mui.icons.preview-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PreviewSharp" :default PreviewSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-preview-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PreviewSharp)))