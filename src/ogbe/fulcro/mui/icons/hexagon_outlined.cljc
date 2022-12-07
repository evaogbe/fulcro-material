(ns ogbe.fulcro.mui.icons.hexagon-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HexagonOutlined" :default HexagonOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hexagon-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HexagonOutlined)))