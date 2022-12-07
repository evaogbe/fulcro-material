(ns ogbe.fulcro.mui.icons.pan-tool-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PanToolRounded" :default PanToolRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pan-tool-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PanToolRounded)))