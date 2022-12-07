(ns ogbe.fulcro.mui.icons.earbuds
  #?(:cljs (:require
            ["@mui/icons-material/Earbuds" :default Earbuds]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-earbuds
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Earbuds)))