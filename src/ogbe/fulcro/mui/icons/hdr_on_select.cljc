(ns ogbe.fulcro.mui.icons.hdr-on-select
  #?(:cljs (:require
            ["@mui/icons-material/HdrOnSelect" :default HdrOnSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-on-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrOnSelect)))