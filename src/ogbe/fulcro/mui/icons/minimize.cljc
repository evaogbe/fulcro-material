(ns ogbe.fulcro.mui.icons.minimize
  #?(:cljs (:require
            ["@mui/icons-material/Minimize" :default Minimize]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-minimize
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Minimize)))