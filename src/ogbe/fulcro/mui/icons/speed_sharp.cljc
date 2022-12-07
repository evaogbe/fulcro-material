(ns ogbe.fulcro.mui.icons.speed-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SpeedSharp" :default SpeedSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speed-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeedSharp)))