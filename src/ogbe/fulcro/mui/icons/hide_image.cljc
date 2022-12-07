(ns ogbe.fulcro.mui.icons.hide-image
  #?(:cljs (:require
            ["@mui/icons-material/HideImage" :default HideImage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hide-image
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HideImage)))