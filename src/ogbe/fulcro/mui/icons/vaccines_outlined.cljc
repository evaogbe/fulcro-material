(ns ogbe.fulcro.mui.icons.vaccines-outlined
  #?(:cljs (:require
            ["@mui/icons-material/VaccinesOutlined" :default VaccinesOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vaccines-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VaccinesOutlined)))