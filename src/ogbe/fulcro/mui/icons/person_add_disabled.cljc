(ns ogbe.fulcro.mui.icons.person-add-disabled
  #?(:cljs (:require
            ["@mui/icons-material/PersonAddDisabled" :default PersonAddDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-add-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonAddDisabled)))