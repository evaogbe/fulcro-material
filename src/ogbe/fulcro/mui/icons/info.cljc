(ns ogbe.fulcro.mui.icons.info
  #?(:cljs (:require
            ["@mui/icons-material/Info" :default Info]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-info
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Info)))