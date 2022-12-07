(ns ogbe.fulcro.mui.icons.sim-card-download
  #?(:cljs (:require
            ["@mui/icons-material/SimCardDownload" :default SimCardDownload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sim-card-download
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SimCardDownload)))