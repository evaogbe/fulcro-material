(ns ogbe.fulcro.mui.icons.facebook-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FacebookRounded" :default FacebookRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-facebook-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FacebookRounded)))