(ns ogbe.fulcro.mui.icons.signal-cellular-nodata
  #?(:cljs (:require
            ["@mui/icons-material/SignalCellularNodata" :default SignalCellularNodata]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-signal-cellular-nodata
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SignalCellularNodata)))