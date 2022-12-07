(ns ogbe.fulcro.mui.icons.wb-twilight
  #?(:cljs (:require
            ["@mui/icons-material/WbTwilight" :default WbTwilight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-wb-twilight
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WbTwilight)))