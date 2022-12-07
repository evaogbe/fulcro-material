(ns ogbe.fulcro.mui.icons.hexagon-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HexagonRounded" :default HexagonRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hexagon-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HexagonRounded)))