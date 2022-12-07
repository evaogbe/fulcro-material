(ns ogbe.fulcro.mui.icons.tornado
  #?(:cljs (:require
            ["@mui/icons-material/Tornado" :default Tornado]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tornado
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tornado)))