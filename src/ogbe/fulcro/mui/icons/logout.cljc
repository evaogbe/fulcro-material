(ns ogbe.fulcro.mui.icons.logout
  #?(:cljs (:require
            ["@mui/icons-material/Logout" :default Logout]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logout
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Logout)))