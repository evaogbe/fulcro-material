(ns ogbe.fulcro.mui.icons.preview-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PreviewTwoTone" :default PreviewTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-preview-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PreviewTwoTone)))