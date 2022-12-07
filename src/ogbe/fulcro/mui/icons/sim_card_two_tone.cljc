(ns ogbe.fulcro.mui.icons.sim-card-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SimCardTwoTone" :default SimCardTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sim-card-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SimCardTwoTone)))