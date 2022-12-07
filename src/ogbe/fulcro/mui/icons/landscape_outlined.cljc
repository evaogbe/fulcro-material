(ns ogbe.fulcro.mui.icons.landscape-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LandscapeOutlined" :default LandscapeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-landscape-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LandscapeOutlined)))