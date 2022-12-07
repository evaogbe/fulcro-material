(ns ogbe.fulcro.mui.icons.sim-card-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SimCardSharp" :default SimCardSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sim-card-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SimCardSharp)))