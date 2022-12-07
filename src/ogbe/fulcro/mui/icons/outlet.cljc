(ns ogbe.fulcro.mui.icons.outlet
  #?(:cljs (:require
            ["@mui/icons-material/Outlet" :default Outlet]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outlet
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Outlet)))