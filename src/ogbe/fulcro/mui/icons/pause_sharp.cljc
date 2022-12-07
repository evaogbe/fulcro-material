(ns ogbe.fulcro.mui.icons.pause-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PauseSharp" :default PauseSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PauseSharp)))