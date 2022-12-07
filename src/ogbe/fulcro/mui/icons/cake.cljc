(ns ogbe.fulcro.mui.icons.cake
  #?(:cljs (:require
            ["@mui/icons-material/Cake" :default Cake]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cake
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cake)))