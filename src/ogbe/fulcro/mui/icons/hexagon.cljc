(ns ogbe.fulcro.mui.icons.hexagon
  #?(:cljs (:require
            ["@mui/icons-material/Hexagon" :default Hexagon]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hexagon
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Hexagon)))