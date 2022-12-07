(ns ogbe.fulcro.mui.icons.directions-run
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsRun" :default DirectionsRun]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-run
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsRun)))