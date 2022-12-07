(ns ogbe.fulcro.mui.icons.hexagon-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HexagonSharp" :default HexagonSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hexagon-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HexagonSharp)))