(ns ogbe.fulcro.mui.icons.pentagon-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PentagonOutlined" :default PentagonOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pentagon-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PentagonOutlined)))