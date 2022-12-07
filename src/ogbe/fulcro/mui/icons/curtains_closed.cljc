(ns ogbe.fulcro.mui.icons.curtains-closed
  #?(:cljs (:require
            ["@mui/icons-material/CurtainsClosed" :default CurtainsClosed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-curtains-closed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CurtainsClosed)))