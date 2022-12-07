(ns ogbe.fulcro.mui.icons.person-add-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PersonAddRounded" :default PersonAddRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-add-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonAddRounded)))