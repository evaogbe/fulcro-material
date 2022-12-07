(ns ogbe.fulcro.mui.icons.sim-card-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SimCardOutlined" :default SimCardOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sim-card-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SimCardOutlined)))