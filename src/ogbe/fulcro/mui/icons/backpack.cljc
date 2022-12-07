(ns ogbe.fulcro.mui.icons.backpack
  #?(:cljs (:require
            ["@mui/icons-material/Backpack" :default Backpack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backpack
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Backpack)))