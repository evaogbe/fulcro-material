(ns ogbe.fulcro.mui.icons.swap-horiz
  #?(:cljs (:require
            ["@mui/icons-material/SwapHoriz" :default SwapHoriz]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swap-horiz
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwapHoriz)))