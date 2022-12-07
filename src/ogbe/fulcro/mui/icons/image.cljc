(ns ogbe.fulcro.mui.icons.image
  #?(:cljs (:require
            ["@mui/icons-material/Image" :default Image]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Image)))