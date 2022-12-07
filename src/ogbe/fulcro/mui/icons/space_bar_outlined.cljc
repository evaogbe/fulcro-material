(ns ogbe.fulcro.mui.icons.space-bar-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SpaceBarOutlined" :default SpaceBarOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-space-bar-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpaceBarOutlined)))