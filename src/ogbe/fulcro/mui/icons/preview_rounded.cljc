(ns ogbe.fulcro.mui.icons.preview-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PreviewRounded" :default PreviewRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-preview-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PreviewRounded)))