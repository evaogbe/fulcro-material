(ns ogbe.fulcro.mui.icons.hdr-off-select
  #?(:cljs (:require
            ["@mui/icons-material/HdrOffSelect" :default HdrOffSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-off-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrOffSelect)))