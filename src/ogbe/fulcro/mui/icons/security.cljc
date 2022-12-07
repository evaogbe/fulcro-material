(ns ogbe.fulcro.mui.icons.security
  #?(:cljs (:require
            ["@mui/icons-material/Security" :default Security]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-security
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Security)))