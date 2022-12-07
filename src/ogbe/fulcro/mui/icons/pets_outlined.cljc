(ns ogbe.fulcro.mui.icons.pets-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PetsOutlined" :default PetsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pets-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PetsOutlined)))