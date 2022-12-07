(ns ogbe.fulcro.mui.icons.present-to-all
  #?(:cljs (:require
            ["@mui/icons-material/PresentToAll" :default PresentToAll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-present-to-all
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PresentToAll)))