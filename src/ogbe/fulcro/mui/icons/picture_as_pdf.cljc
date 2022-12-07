(ns ogbe.fulcro.mui.icons.picture-as-pdf
  #?(:cljs (:require
            ["@mui/icons-material/PictureAsPdf" :default PictureAsPdf]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-picture-as-pdf
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PictureAsPdf)))