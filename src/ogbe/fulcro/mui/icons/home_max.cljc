(ns ogbe.fulcro.mui.icons.home-max
  #?(:cljs (:require
            ["@mui/icons-material/HomeMax" :default HomeMax]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-home-max
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HomeMax)))