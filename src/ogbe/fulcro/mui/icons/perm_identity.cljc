(ns ogbe.fulcro.mui.icons.perm-identity
  #?(:cljs (:require
            ["@mui/icons-material/PermIdentity" :default PermIdentity]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-perm-identity
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PermIdentity)))