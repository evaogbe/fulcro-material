(ns ogbe.fulcro.mui.icons.replay-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ReplaySharp" :default ReplaySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-replay-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ReplaySharp)))