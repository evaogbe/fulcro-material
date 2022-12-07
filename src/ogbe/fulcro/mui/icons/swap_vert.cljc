(ns ogbe.fulcro.mui.icons.swap-vert
  #?(:cljs (:require
            ["@mui/icons-material/SwapVert" :default SwapVert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swap-vert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwapVert)))