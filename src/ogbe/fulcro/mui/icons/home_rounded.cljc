(ns ogbe.fulcro.mui.icons.home-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HomeRounded" :default HomeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-home-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HomeRounded)))