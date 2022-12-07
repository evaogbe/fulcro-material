(ns ogbe.fulcro.mui.icons.explicit-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ExplicitRounded" :default ExplicitRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-explicit-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExplicitRounded)))