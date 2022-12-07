(ns ogbe.fulcro.mui.icons.pentagon-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PentagonRounded" :default PentagonRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pentagon-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PentagonRounded)))