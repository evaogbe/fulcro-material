(ns ogbe.fulcro.mui.icons.data-saver-off
  #?(:cljs (:require
            ["@mui/icons-material/DataSaverOff" :default DataSaverOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-data-saver-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DataSaverOff)))