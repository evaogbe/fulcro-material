(ns ogbe.fulcro.mui.icons.change-history
  #?(:cljs (:require
            ["@mui/icons-material/ChangeHistory" :default ChangeHistory]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-change-history
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChangeHistory)))