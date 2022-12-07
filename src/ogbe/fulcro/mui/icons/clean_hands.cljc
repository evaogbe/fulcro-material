(ns ogbe.fulcro.mui.icons.clean-hands
  #?(:cljs (:require
            ["@mui/icons-material/CleanHands" :default CleanHands]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-clean-hands
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CleanHands)))