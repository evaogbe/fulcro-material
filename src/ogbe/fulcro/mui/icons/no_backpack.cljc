(ns ogbe.fulcro.mui.icons.no-backpack
  #?(:cljs (:require
            ["@mui/icons-material/NoBackpack" :default NoBackpack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-backpack
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoBackpack)))