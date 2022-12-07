(ns ogbe.fulcro.mui.icons.hdr-on
  #?(:cljs (:require
            ["@mui/icons-material/HdrOn" :default HdrOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hdr-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HdrOn)))