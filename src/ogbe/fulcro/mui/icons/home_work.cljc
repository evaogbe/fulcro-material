(ns ogbe.fulcro.mui.icons.home-work
  #?(:cljs (:require
            ["@mui/icons-material/HomeWork" :default HomeWork]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-home-work
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HomeWork)))